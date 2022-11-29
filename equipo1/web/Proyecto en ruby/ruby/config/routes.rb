Rails.application.routes.draw do
  devise_for :users
  get 'main/home'
  root "main#home"
end
