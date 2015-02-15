def average(list):
    """
    >>> average([1, 2, 3])
    2
    """
    total = 0
    for i in list: total = total + i
    return total / len(list)
