import os, sys
folder = sys.argv[1]
os.system(f"cd {folder} && tar -acf {folder}.zip .")

# python ./Tools/zip_win.py <TEN FOLDER>
# vi du: python ./Tools/zip_win.py J07010