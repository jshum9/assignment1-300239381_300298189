import csv
import random
import math

def generate_polar_points(num_points):
    points = []
    for _ in range(num_points):
        radius = random.uniform(0, 100)
        angle = random.uniform(0, 2*math.pi)
        points.append((radius, angle))
    return points

def write_csv_file(filename, points):
    with open(filename, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        for point in points:
            writer.writerow(point)

num_points = 700000
points = generate_polar_points(num_points)
filename = 'polar_points.csv'
write_csv_file(filename, points)

print(f"CSV file '{filename}' containing {num_points} Polar points has been generated.")