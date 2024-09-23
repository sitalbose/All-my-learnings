import psutil

def check_cpu_usage(percent):
    usage= psutil.cpu_percent(1)
    print("DEBUG: usage: {}".format(usage))
    return usage<percent

if  not check_cpu_usage(60):
    print("Error! CPU is overloaded") 
else:
    print("Everything ok")       