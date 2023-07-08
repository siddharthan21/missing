import openpyxl
path = "/home/siddharth/intreset/aa.xlsx"
wb_obj = openpyxl.load_workbook(path)
sheet_obj = wb_obj.active
aray = []
array2 = []
arrr3 = []
for i in range(1, 485):
    aray.append(str(sheet_obj["B"+str(i)].value))
for i in range(1,len(aray)):
    if aray[i].isnumeric():
        array2.append(int(aray[i]))
arra4 = []
for i in range(1,625):
    arra4.append(i)
missing_elements = []
print(len(arra4),len(array2))
for i in array2:
    if i in arra4:
        arra4.remove(i)     

print(arra4)  
