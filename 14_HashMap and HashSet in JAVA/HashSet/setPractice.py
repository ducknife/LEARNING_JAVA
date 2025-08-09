#import ...

DUCKNIFE = '__main__'

if __name__ == DUCKNIFE:
    #ducknife
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    se = set()
    differ = set()
    union = set()
    intersec = set()
    for x in a:
        se.add(x)
        union.add(x)
    for y in b:
        if y in se:
            intersec.add(y)
            se.discard(y)
        else:
            union.add(y)
    for x in se:
        differ.add(x)
    print(' '.join(map(str, differ)))
    print(' '.join(map(str, union)))
    print(' '.join(map(str, intersec)))