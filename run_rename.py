import os

dir1 = os.listdir("./_01_Fundamentals")
dir2 = os.listdir("./_02_Basic_DSA")

dir1 = [_ for _ in dir1 if _.endswith(".java")]
dir2 = [_ for _ in dir2 if _.endswith(".java")]

for _ in dir1:
    s  = ''


print(dir1[0:2])
print(dir2[0:2])