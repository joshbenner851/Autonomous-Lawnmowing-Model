import urllib.request
import os

def parse_links(source):
    links=[]
    t=str(source).split('<img src="')
    for i in t:
        r=str(i).split('"')
        links.append(r[0])
    return links
        

def download(links):
    name=0
    for i in links:
        try:
            v=urllib.request.urlopen(i)
            f=open(str(name)+".jpg","wb")
            f.write(v.read())
            f.close()
            name+=1
        except:print("C")

def load_source(website):
    s=urllib.request.urlopen(website)
    v=s.read()
    return v
    
def main():
    search=input("Start:")
    source=load_source("http://www.zappos.com/men-shirts-tops~2")
    links=parse_links(source)
    download(links)
    for i in links:print(i)
    print("END")
    
main()
