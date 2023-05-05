// 取N~M的随机整数
function getRandom(N = 0, M = 0) {
    return Math.floor(Math.random() * (M - N + 1)) + N
}