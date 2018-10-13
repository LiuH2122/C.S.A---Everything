f = open("pokemon.txt", "r");
wf = open("pokemonclasswrite.txt", "w");
# print("     — ")
cnt = 0
for line in f:
    line = line.strip("\n")
    line = line.split(" ")
    if len(line) == 11:
        wf.write(f'pokemon p{cnt} = new pokemon({line[5]}, {line[6]}, {line[7]}, {line[8]}, {line[9]}, {line[10]}, 1, 1, 1, "{line[2]}", "{line[3]}");\n')
        wf.write(f'pokemonPool[{cnt}] = p{cnt};\n')
    elif len(line) == 10:
        wf.write(f'pokemon p{cnt} = new pokemon({line[4]}, {line[5]}, {line[6]}, {line[7]}, {line[8]}, {line[9]}, 1, 1, 1, "{line[1]}", "{line[2]}");\n')
        wf.write(f'pokemonPool[{cnt}] = p{cnt};\n')

    cnt+=1;