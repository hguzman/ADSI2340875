class CreateMarcas < ActiveRecord::Migration[6.1]
  def change
    create_table :marcas do |t|
      t.string :nombre

      t.timestamps
    end
    add_column :cars, :marca_id, :integer
    add_column :cars, :motor, :string

  end
end
