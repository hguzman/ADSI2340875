class Car < ApplicationRecord
    mount_uploader :avatar, AvatarUploader
    belongs_to :marca
end
