class HomeController < ApplicationController
  respond_to :html, :json
  #before_action :authenticate_usuario!
  
  def dashboard

      @productos = Producto.all
      respond_with(@productos)
  end
end
