import os

def add_extension(file_path,new extension):
    if not os.path.exits(file_path):
        print(f"The file '{file_path}' does not exit.")
        base_name=os.path.splitext(file_path)
        
        new_file_path=f