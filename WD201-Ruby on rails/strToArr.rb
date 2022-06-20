strName = "I am Sangeetha Ramachandran"
p strName.split(" ")

# Merge two arrays
arr_1 = [12,13,14,15]
arr_2 = [13,16,17,11,18]
# To get unique values from array, use "uniq" keyword
output = (arr_1 + arr_2).uniq
p output

# Print list of todos by category

# Fill in code that will print:
#   money:
#     Send invoice
#     Pay rent
#     Pay taxes
#   organize:
#     Clean room
#     Arrange books
#   food:
#     Buy groceries

cate = [["money",["Send invoice", "Pay rent","Pay taxes"]], 
["organize",["Clean room","Arrange books"]],
["food",["Buy groceries"]]]

len =  cate.length
for var in 0...cate.length do
  num = var
  p cate[num][0]
  puts cate[num][1]
end

# p todos


