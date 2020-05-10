from multiprocessing import Process

def print_func(continent='Asia'):
    print('The name of continent is : ', continent)

if __name__ == "__main__":
    names = ['America', 'Europe', 'Africa']
    procs = []
    proc = Process(target=print_func)
    print(proc)