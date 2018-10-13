f = open("moves.txt", "r");
wf = open("movesWritten.txt", "w")
# print("     — ")
cnt = 0
for line in f:
    line = line.strip("\n")
    line = line.replace("\t", " ")
    line = line.replace("  ", " ")
    line = line.replace("â€”", "none")

    line = line.split(" ")
    if(len(line)>9):
        line[1:(len(line)-7)] = [' '.join(line[1:(len(line)-7)])]

    if line[3] == "Physical" or "Special":
        if line[6] != "none":
            if line[7] == "none":
                line[7] = '100'
            print(f'moves m{cnt} = new moves("{line[2]}", "{line[1]}", {line[6]}, {line[7]}, "{line[3]}");')
            print(f"movePool[{cnt}] = m{cnt};")
            cnt+=1
