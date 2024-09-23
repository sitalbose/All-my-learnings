import shutil
import psutil

#Install these library if not present. Recommended pip install

# For Disk Usage

du=shutil.disk_usage('/')

# “/” root directory
used=(du.used/du.total)*100

# du.used give used memory and so du.total #gives total memory and du.free gives free memory

print('Used Disk :{:.2f} %'.format(used))

print('Available Disk :{:.2f} %'.format(100-used))

#For Cpu Usage

for i in range(50):

  pu=psutil.cpu_percent(0.5)

#argument inside cpu_percent is seconds to check health check after every #0.5 second

print(pu)




