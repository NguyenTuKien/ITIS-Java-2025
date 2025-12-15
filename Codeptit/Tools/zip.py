import os, sys
folder = sys.argv[1]
os.system(f"cd {folder} && tar -acf {folder}.zip .")