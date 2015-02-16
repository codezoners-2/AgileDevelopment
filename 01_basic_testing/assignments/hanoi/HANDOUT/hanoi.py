"""
http://en.wikipedia.org/wiki/Tower_of_Hanoi
"""

def hanoi(source, helper, target):
    """
    >>> hanoi([1], [], [])
    [([1], [],  []),
      ([], [], [1])]
    """
    pass

if __name__ == "__main__":
    import doctest
    doctest.testmod(optionflags=doctest.NORMALIZE_WHITESPACE, verbose=True)
