def func(dig_prices, matrix):
    min_price = min(dig_prices)
    min_connected = float('inf')
    idx = [0, 0]
    for i in range(n):
        for j in range(n):
            if matrix[i][j] < min_price and matrix[i][j] < min_connected:
                min_connected = matrix[i][j]
                idx[0], idx[1] = i, j

    visited = []
    res = 0
    if min_connected != float('inf'):
        visited.append(idx[0])
        visited.append(idx[1])
        res += matrix[idx[0]][idx[1]]
        for x in range(n):
            if x in visited:
                continue
            else:
                index, dig = compare_price(x, visited, dig_prices, matrix)
                if dig:
                    res += dig_prices[x]
                    visited.append(x)
                else:
                    res += matrix[x][index]
                    visited.append(index)
    else:
        visited.append(dig_prices.index(min_price))
        res += min_price
        for x in range(n):
            if x in visited:
                continue
            else:
                index, dig = compare_price(x, visited, dig_prices, matrix)
                if dig:
                    res += dig_prices[x]
                    visited.append(x)
                else:
                    res += matrix[x][index]
                    visited.append(index)
    return res


def compare_price(i, visit, dig_price, mat):
    dig_cost = dig_price[i]
    flag = True
    idx = -1
    min_cost = float('inf')
    for j in visit:
        if mat[i][j] < dig_cost and mat[i][j] < min_cost:
            idx = j
            flag = False
            min_cost = mat[i][j]

    return idx, flag


n = int(input())
dig_prices = []
for _ in range(n):
    dig_prices.append(int(input()))

matrix = []
for _ in range(n):
    matrix.append(list(map(int, input().split())))

# print(dig_prices)
# print(matrix)

res = func(dig_prices, matrix)
print(res)
