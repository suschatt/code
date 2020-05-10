import dash
import dash_core_components as dcc
import dash_html_components as html
from dash.dependencies import Input, Output
import quandl
from urllib.request import urlopen

quandl.ApiConfig.api_key = 'VGyu39wByYSFEE1hXsDj'

zipCode=''

def indicatorCodeFile():
    serviceList={}
    with urlopen(r'https://s3.amazonaws.com/quandl-production-static/zillow/indicators.csv') as data:
        for line in data:
            testList = line.decode('UTF-8').split('|')
            serviceList.update({testList[0]:testList[1].replace('\n','')})

    return serviceList

def caseSchillerIndex():
    data = quandl.get("FMAC/HPI")
    df = data['TX']
    return df.to_dict()

def zillowData(zipCode,code):
    try:
        return dict(list(quandl.get(['ZILLOW/Z'+zipCode+'_'+code]).to_dict().values())[0])
    except quandl.errors.quandl_error.NotFoundError:
             return None

#WebPage Design starts here
external_stylesheets = ['https://codepen.io/chriddyp/pen/bWLwgP.css']
app = dash.Dash(__name__, external_stylesheets=external_stylesheets)
app.title = 'Housing Analysis Dashboard'

colors = {
    'background': '#111111',
    'text': '#7FDBFF'
}


def graphLayout(title):
    return {
                            'title' : title,
                            'plot_bgcolor': colors['background'],
                            'paper_bgcolor': colors['background'],
                            'font': {
                                    'color': colors['text']
                                    }
            }

def defineCaseSchillerIndex():
    return dcc.Graph(id='caseSchillerIndex',
              figure = {
                            'data': [{'x': list(caseSchillerIndex().keys()),'y' : list(caseSchillerIndex().values()),
                            'type':'line','name':'Case Schiller Index Texas'},],
                            'layout': graphLayout('Case Schiller Index')
                        }
            )

app.layout = html.Div(style={'backgroundColor': colors['background']},children=[
    html.H1('Housing Dashboard',style={'textAlign': 'center', 'color': '#FF0000'}),
    html.H3('Enter your zipcode',style={'textAlign': 'left', 'color': '#00FF00'}),
    dcc.Input(id='zipcodeInput', type='text'),
    html.Button('Submit', id='submitButton',style={'color': '#00FF00'}),
    #html.Div(id="getZipCode"),
    dcc.Loading(id="loading-1", children=[html.Div(id="loading-output-1")], type="default"),
    defineCaseSchillerIndex(),
    ]#end children
    )#end top level html div

@app.callback(Output("loading-1","children"),[Input("zipcodeInput","value")],)

def update_graph(value):
    graphList=[]
    zipCode=str(value)
    for label,code in indicatorCodeFile().items():
        data = zillowData(zipCode,code)
        if bool(data):
            graphList.append(dcc.Graph(id=label,
                figure= {
                            'data': [{'x': list(data.keys()),'y' : list(data.values()),
                            'type':'line','name':label},],
                            'layout': graphLayout(label)
                        }
                            )#end dcc
            )#end append
    
    return html.Div(graphList)
        
if __name__ == "__main__":
   app.run_server(debug=True)
   
   