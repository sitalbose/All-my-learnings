import psutil
def check_cpu_usage():
    usage=psutil.cpu_percent(0.1)
    return usage<75

print()    

