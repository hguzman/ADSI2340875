class AddAvatarToCars < ActiveRecord::Migration[6.1]
  def change
    add_column :cars, :avatar, :string
  end
end
