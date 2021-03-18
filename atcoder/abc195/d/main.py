from copy import deepcopy

def run():
    n, m, q = map(int, input().split())
    wv = [[0 for i in range(2)] for i in range(n)]
    for i in range(n):
        w, v = map(int, input().split())
        wv[i] = [w, v]
    wv.sort(key=lambda t: (t[0], -t[1]))
    x = [int(i) for i in input().split()]
    for i in range(q):
        r, l = map(int, input().split())
        qx = x[:r - 1] + x[l:]
        if(len(qx) == 0):
            print(0)
        else:
            qx.sort()
            qw = deepcopy(wv)
            ans = 0
            for j in qx:
                tans, ti = -1, -1
                for k in range(len(qw)):
                    if qw[k][0] > j:
                        break
                    if qw[k][1] > tans:
                        tans, ti = qw[k][1], k
                if tans >= 0:
                    ans += tans
                    qw.pop(ti)
                if len(qw) == 0:
                    break
            print(ans)

if __name__ == "__main__":
    run()
