def removecharacter(s,c):
    count = s.count(c)
    s = list(s)
    while count :
        s.remove(c)
        count -= 1
        s = "".join(s)
        print (s)
    if __name__ == "__main__":
         s = "getin"
         removecharacter(s,'g')
 

