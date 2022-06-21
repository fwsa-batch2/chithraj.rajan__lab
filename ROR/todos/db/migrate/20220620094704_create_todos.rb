class CreateTodos < ActiveRecord::Migration[6.1]
  def change
    create_table :todos do |t|
      t.string :First_name
      t.string :Last_name
      t.date :DOB
      t.string :Password
      t.string :CPassword

      t.timestamps
    end
  end
end
