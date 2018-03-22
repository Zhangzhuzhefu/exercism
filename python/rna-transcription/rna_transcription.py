def to_rna(dna_strand):
    rules = {'G':'C',
             'C':'G',
             'T':'A',
             'A':'U'}
    return "".join(rules[c] for c in dna_strand)
