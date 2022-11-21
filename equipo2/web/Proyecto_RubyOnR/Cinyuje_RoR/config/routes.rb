Rails.application.routes.draw do
  get 'productos/index'
  get 'productos/new'
  get 'productos/create'
  get 'productos/show'
  get 'productos/edit'
  get 'productos/show'
  get 'productos/update'
  get 'productos/destroy'
  devise_for :usuarios
  get 'home/dashboard'
  root to: 'home#dashboard'
  resources :productos
end
