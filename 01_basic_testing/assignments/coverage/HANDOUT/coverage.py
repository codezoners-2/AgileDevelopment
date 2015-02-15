"""
All the tests pass in this module, but the code in each function is incorrect in some way.
Implement new tests to show the faults, and then fix the faults.
"""

def factorial(n):
    """
    >>> factorial(1)
    1
    >>> factorial(3)
    6
    """
    if n == 1:
        return 1
    else:
        return n * factorial(n - 1)

def stutter(string):
    """
    Concatenate all substrings, so for 'ABC' return 'AABABC'.

    >>> stutter('A')
    'A'
    >>> stutter('')
    ''
    """
    result = ''
    for i in range(1, len(string) + 1):
        result = string[: i]
    return result

def lastItem(string):
    """
    >>> lastItem("Foo Bar Bazz")
    'z'
    """
    return string[len(string) - 2]

def camelCase(string):
    """
    Given a string with spaces, remove all spaces and capitalise the first character
    of the word after each run of spaces. The first character of the string should
    be lower case.

    >>> camelCase('capitalise this!')
    'capitaliseThis!'
    """
    p = string.index(' ')
    return string[: p] + string[p + 1 :].capitalize()

def cat_dog(str):
    """
    Return True if the string "cat" and "dog" appear the same number of times
    in the given string.

    >>> cat_dog('catdog')
    True
    >>> cat_dog('catcat')
    False
    """
    cats = (str.find('cat') >= 0)
    dogs = (str.find('dog') >= 0)
    return cats == dogs

def squirrel_party(cigars, is_weekend):
    """
    When squirrels get together for a party, they like to have cigars. A
    squirrel party is successful when the number of cigars is between 40 and
    60, inclusive. Unless it is the weekend, in which case there is no upper
    bound on the number of cigars. Return True if the party with the given
    values is successful, or False otherwise.

    >>> squirrel_party(50, False)
    True
    >>> squirrel_party(70, False)
    False
    >>> squirrel_party(90, True)
    True
    """
    if is_weekend:
        return True
    else:
        return cigars > 40 and cigars < 60

if __name__ == "__main__":
    import doctest
    doctest.testmod()
