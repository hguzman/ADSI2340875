class CarsController < ApplicationController
  before_action :authenticate_user!

  def index
    @cars = Car.all
  end

  def new
    @car = Car.new
  end

  def edit
    @car = Car.find(params[:id])
  end

  def show
    @car = Car.find(params[:id])
  end

  def create
    @car = Car.new(set_car)
    if @car.save
      redirect_to car_path(@car)
    else
      render :new
    end
  end

  def update
    @car = Car.find(params[:id])
    if @car.update(set_car)
      redirect_to car_path(@car)
    else
      render :edit
    end
  end

  def destroy
    @car = Car.find(params[:id])
    @car.destroy
    redirect_to cars_path, notice: "Ok"
  end

  private

  def set_car
    params.require(:car).permit(:placa, :color, :modelo, :motor, :marca_id, :avatar)
  end
end
