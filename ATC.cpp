#include <bits/stdc++.h>
using namespace std;

bool isOperator(char ch) {
    return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
}

int operatorPrecedence(char op) {
    if (op == '^')
        return 3;
    if (op == '*' || op == '/')
        return 2;
    if (op == '+' || op == '-')
        return 1;
    return -1;
}

string convertInfixToPostfix(string s) {
    stack<char> st;
    string result;

    for (int i = 0; i < s.size(); i++) {
        if (isalnum(s[i])) {
            result += s[i];
        }
        else if (s[i] == '(') {
            st.push(s[i]);
        }
        else if (s[i] == ')') {
            while (!st.empty() && st.top() != '(') {
                result += st.top();
                st.pop();
            }
            if (!st.empty())
                st.pop();
        }
        else {
            while (!st.empty() && operatorPrecedence(s[i]) <= operatorPrecedence(st.top())) {
                result += st.top();
                st.pop();
            }
            st.push(s[i]);
        }
    }

    while (!st.empty()) {
        result += st.top();
        st.pop();
    }

    return result;
}

string convertToPrefix(string infix) {
    reverse(infix.begin(), infix.end());

    for (int i = 0; i < infix.size(); i++) {
        if (infix[i] == '(')
            infix[i] = ')';
        else if (infix[i] == ')')
            infix[i] = '(';
    }

    string postfix = convertInfixToPostfix(infix);
    reverse(postfix.begin(), postfix.end());

    return postfix;
}

int main() {
    string s = "(a-b/c)*(a/k-1)";
    cout << "Prefix: " << convertToPrefix(s) << endl;
    return 0;
}

upcoming ATC lab code
