class ProductosController < ApplicationController
  def index
    @productos = Producto.all
  end

  def new
    @producto = Producto.new
  end


  def show
    @producto = Producto.find(params[:id])
  end

  def create
    @producto = Producto.new(set_producto)
    if @producto.save
      redirect_to producto_path(@producto)
    else
      render :new
  end
end

  def edit
    @producto = Producto.find(params[:id])
  end


  def update
    @producto = Producto.find(params[:id])
    if @producto.update(set_producto)
      redirect_to producto_path(@producto)
    else
      render :edit
    end
  end

  def destroy
    @producto = Producto.find(params[:id])
    @producto.destroy
    redirect_to productos_path
  end

  private

  def set_producto
    params.require(:producto).permit(:nombre, :descripcion, :precio, :stock)
  end

end

