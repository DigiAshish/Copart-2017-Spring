require 'csv'
require 'geokit'
include GeoKit::Geocoders

fields_to_insert = %w{ lat,long }
rows_to_insert = []

CSV.foreach("VehicleDetails.csv", headers: true) do |row=Location|
  row_to_insert = row.to_hash.select { |k, v| fields_to_insert.include?(k) }
  rows_to_insert << row_to_insert
end

CSV.foreach("VehicleDetails.csv", headers: true) do |row=Location|
coords = MultiGeocoder.geocode(Location)
row_to_insert = row.to_hash.select { |coords.lat, coords.lng| fields_to_insert.include?(k) }
rows_to_insert << row_to_insert
end