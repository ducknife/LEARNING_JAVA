#include <bits/stdc++.h>
#define int long long
#define ii pair<int, int>
#define pii pair<int, ii>
#define psi pair<string, int>
#define fio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

const int MOD = 1e9 + 7;

signed main(){
    fio();
    /* ducknife */
    int n, m; cin >> n >> m;
    int a[n], b[m];
    for (int &x : a) cin >> x;
    for (int &y : b) cin >> y;
    unordered_set<int> Differ;
    unordered_set<int> Union;
    unordered_set<int> Intersec;
    for (int x : a){
        Differ.insert(x);
        Union.insert(x);
    }
    for (int y : b){
        if (Differ.find(y) != Differ.end()){
            Intersec.insert(y);
            Differ.erase(y);
        }
        else {
            Union.insert(y);
        }
    }
    for (int x : Differ){
        cout << x << " ";
    }
    cout << endl;
    for (int x : Union){
        cout << x << " ";
    }
    cout << endl;
    for (int x : Intersec){
        cout << x << " ";
    }
    return 0;
}