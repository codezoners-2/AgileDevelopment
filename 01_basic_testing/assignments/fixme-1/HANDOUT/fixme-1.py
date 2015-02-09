# Every function here is broken: some of the tests fail. Can you fix the code so that all the tests pass?

def adder(a, b):
    """
    Add two numbers together:
    >>> adder(2, 2)
    4

    >>> adder(3, 4)
    7
    """
    return a * b

# Slicing exercises (should mostly be familiar):

def haircut(aList):
    """
    Write a function haircut(aList) that chops the first and last element of the list.
    >>> haircut([0, 1, 2, 3, 4])
    [1, 2, 3]

    >>> haircut([0, 1])
    []
    """
    return aList[1 :]

def wordSlicer(aList, aWord):
    """
    Define a function wordSlicer(aList, aWord) which takes a list and a word and returns all
    the elements of the list up until that word.

    >>> wordSlicer(["use", "the", "force", "Luke"], "force")
    ['use', 'the']
    """
    return aList[aList.index(aWord)]

def repeatPart(aList, start, end):
    """
    Write a function repeatPart(aList, start, end) which takes a list and a start/end position
    and returns the list with the bit between the start/end position attached to the end.
    Use slicing operations to get the job done.

    >>> repeatPart([0,1,2,3,4,5,6], 2, 4)
    [0, 1, 2, 3, 4, 5, 6, 2, 3]
    """
    return aList + aList[start]

def triangle(limit):
    """
    Return a list from 0 to limit (exclusive) and back to 0 again.

    >>> triangle(1)
    [0]

    >>> triangle(3)
    [0, 1, 2, 1, 0]

    >>> triangle(0)
    []
    """
    return range(limit) + range(limit - 1, -1, -1)

def front_back(a, b):
    """
    Consider dividing a string into two halves.
    If the length is even, the front and back halves are the same length.
    If the length is odd, we'll say that the extra char goes in the front half.
    e.g. 'abcde', the front half is 'abc', the back half 'de'.
    Given 2 strings, a and b, return a string of the form
    a-front + b-front + a-back + b-back

    >>> front_back('ABCD', 'XY')
    'ABXCDY'

    >>> front_back('ABCDE', 'XYZ')
    'ABCXYDEZ'

    >>> front_back('Kitten', 'Donut')
    'KitDontenut'
    """
    aBackLen = len(a) / 2
    aFrontLen = len(a) - aBackLen
    bBackLen = len(b) / 2
    bFrontLen = len(b) - bBackLen
    return a[: aFrontLen] + b[: bFrontLen] + a[aBackLen :] + b[bBackLen :]

def not_bad(s):
    """
    Given a string, find the first appearance of the
    substring 'not' and 'bad'. If the 'bad' follows
    the 'not', replace the whole 'not'...'bad' substring
    with 'good'.
    Return the resulting string.

    >>> not_bad('This dinner is not that bad')
    'This dinner is good'

    >>> not_bad('This dinner is good')
    'This dinner is good'

    >>> not_bad('You think this is bad? No, not at all.')
    'You think this is bad? No, not at all.'

    We should be case-insensitive:
    >>> not_bad('My verdict: Not bad')
    'My verdict: good'
    """
    pos_not = s.find('not')
    pos_bad = s.find('bad')

    if pos_not > -1 and pos_bad > pos_not:
        return (s[: pos_not] + "good" + s[pos_bad :])
    else:
        return s

    return s

if __name__ == "__main__":
    import doctest
    doctest.testmod()
