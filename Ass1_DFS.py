graph = {
  '0' : ['1','4'],
  '1' : ['2', '3','4'],
  '2' : ['1','3'],
  '3' : ['1','2'],
  '4' : ['0','1'],
}

visited = set() # Set to keep track of visited nodes of graph.

def dfs(visited, graph, node):  #function for dfs 
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)

# Driver Code
print("Following is the Depth-First Search")
dfs(visited, graph, '0')

#PS C:\Users\admin\Desktop\GayatriPendhari> & C:/Users/admin/AppData/Local/Programs/Python/Python310/python.exe c:/Users/admin/Downloads/DFS.py
#Following is the Depth-First Search
#1
#2
#3
#4
#PS C:\Users\admin\Desktop\GayatriPendhari>
