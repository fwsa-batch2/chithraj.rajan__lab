class School
  def initialize(id, name)
    @name = name
    @id = id
    puts "student name = #{name} , student id = #{id}"
  end

  def add(no1, no2)
    @no1 = no1
    @no2 = no2
    puts no1 + no2
  end
end

chith = School.new(101, "chith")
obj = School.new(456, "kasi")
chith.add(1, 1)
chith.add(5, 7)
