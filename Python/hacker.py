#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    n = int(input())
    for i in enumerate(n):
        print(i)
        s = input()
        print(s[::2] + ' ' + s[1::2])

