//package com.write.code.realgang.intelTest.test;
//
///**
// * @description: python test
// * @author: RealGang
// * @create: 2022-09-09 08:52
// **/
//public class Main {
//
//
//
//def solute(data):
//    result = []
//    tempt = []
//    visited = [0]*len(data)
//    def back_trace(data,start):
//        if start > len(data):
//            return
//        # print(tempt)
//        if len(tempt) == 3:
//            result.append([x for x in tempt])
//            return
//        else:
//            for i in range(start,len(data)):
//                tempt.append(data[i])
//                back_trace(data,i+1)
//                tempt.pop(-1)
//    back_trace(data,0)
//    print(result)
//    num_sum = sum([sum(x) for x in result])
//    print(num_sum,n)
//    return num_sum
//
//
//
//if __name__ == '__main__':
//    n = int(input())
//    data = list(map(lambda x:int(x),input().split(' ')))
//    m = solute(data)
//    for i in range(2, m):
//        while m % i == 0 and n % i == 0:
//            m = m // i
//            n = n // i
//    print(m, n)
//}
