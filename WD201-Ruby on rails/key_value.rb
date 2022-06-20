# Problem 1. Given two arrays books and authors, merge them into a single Hash. The keys of the Hash must be the lower-cased 
# firstname of the authors, and must be symbols.

# books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# hash_book = {}
# authors.map.with_index.each do |i, a|
#     var = i.split(" ")[0].downcase.to_sym
#     hash_book[var] = books[a]
    
# end
# puts hash_book

# Problem 2. Given this list of todos, create a Hash keyed by category, whose value is an array containing all the
#  todos in that category. The keys of the Hash must be a symbol


todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]
   arr_1 = []
   arr_2 = []
   arr_3 = []
   hash_obj = {}
for i in 0...todos.length do
    for j in 0...todos[i].length do
        if todos[i][j]=="money"
            arr_1.push(todos[i][0])
        end
        if todos[i][j]=="organize"
            arr_1.push(todos[i][0])
        end
        if todos[i][j]=="food"
            arr_1.push(todos[i][0])
        end
    end
end
hash_obj[":money"] = arr_1
hash_obj[":organize"] = arr_2
hash_obj[":food"] = arr_3
puts hash_obj
