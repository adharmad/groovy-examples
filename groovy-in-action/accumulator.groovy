def foo(n) {
    return {n += it}
}

def acc = foo(1)
assert acc(2) == 3
assert acc(1) == 4
