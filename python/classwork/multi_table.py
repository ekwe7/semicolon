print(" ")
print("\t\t\t\t" + "Multiplication Table")
print("\t\t\t\t" +"---------------------")
print(" ")

for i in range (1, 10):
	print("\t",i, end="  ")
print(" ")
print("\t" +"--------------------------------------------------------------")
for i in range (1, 10):
	print(i, '|', end="\t")
	for j in range (1, 10):
		print(f"{i * j:2}",end='\t')
	print()