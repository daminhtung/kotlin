class C(val x: Int)

<!CONFLICTING_OVERLOADS!>typealias CC = C<!>

<!CONFLICTING_OVERLOADS!>fun CC(x: Int)<!> = x

class Outer {
    class C(val x: Int)

    <!CONFLICTING_OVERLOADS!>typealias CC = C<!>

    <!CONFLICTING_OVERLOADS!>fun CC(x: Int)<!> = x
}
