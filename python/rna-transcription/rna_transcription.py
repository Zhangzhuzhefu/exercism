def to_rna(dna_strand):
    rules = {'G':'C', 
             'C':'G', 
             'T':'A', 
             'A':'U'}
    return "".join(map(lambda ch: rules.get(ch), dna_strand))
