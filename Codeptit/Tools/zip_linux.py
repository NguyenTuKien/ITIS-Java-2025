import os, sys

folder = sys.argv[1]

os.system(f"zip -r ./{folder}/{folder}.zip ./{folder}/*")

# python ./Tools/zip_linux.py <TEN FOLDER>
# vi du: python ./Tools/zip_linux.py J07010
