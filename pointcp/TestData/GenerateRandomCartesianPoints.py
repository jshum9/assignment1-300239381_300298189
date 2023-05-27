import csv
import random

def generate_cartesian_points(num_points):
    points = []
    for _ in range(num_points):
        x = random.uniform(-100, 100)
        y = random.uniform(-100, 100)
        points.append((x, y))
    return points

def write_csv_file(filename, points):
    with open(filename, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        for point in points:
            writer.writerow(point)

num_points = 700000
points = generate_cartesian_points(num_points)
filename = 'cartesian_points.csv'
write_csv_file(filename, points)

print(f"CSV file '{filename}' containing {num_points} Cartesian points has been generated.")