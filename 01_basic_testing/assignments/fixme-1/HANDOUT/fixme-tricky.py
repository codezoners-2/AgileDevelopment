def not_bad(s):
    """
    Harder examples, attempting to identify the isolated words 'not' and 'bad'.
    Tricky to do completely (for that, we're better off using regular expressions).

    This isn't what the spec. says, but really we should look for isolated words:
    >>> not_bad('not badass')
    'not badass'

    This should not trigger:
    >>> not_bad('notbad')
    'notbad'

    This should:
    >>> not_bad('not bad')
    'good'

    >>> not_bad('Notting Hill is pretty bad.')
    'Notting Hill is pretty bad.'
    """
    return "IMPLEMENT ME!"

if __name__ == "__main__":
    import doctest
    doctest.testmod()
