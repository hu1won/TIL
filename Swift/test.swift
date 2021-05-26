typealias Position = CGPoint
typealias Distance = CGFloat

func inRange1(target: Position, range: Distance) -> Bool {
	return sqrt(target.x * target.x + target.y * target.y) <= range
}

func inRange2(target: Position, ownPosition: Position, range: Distance) -> Bool {
	let dx = ownPosition.x - target.x
	let dy = ownPosition.y - target.y
	let targetDistance = sqrt(dx * dx + dy * dy)
	return targetDistance <= range
}

let minimumDistance: Distance = 2.0

func inRange3(target: Position, ownPosition: Position, range: Distance) -> Bool {
	let dx = ownPosition.x - target.x
	let dy = ownPosition.y - target.y
	let targetDistance = sqrt(dx * dx + dy * dy)
	return targetDistance <= range && targetDistance >= minimumDistance
}

func inRange4(target: Position, ownPosition: Position, friendly: Position, range: Distance) -> Bool {
	let dx = ownPosition.x - target.x
	let dy = ownPosition.y - target.y
	let targetDistance = sqrt(dx * dx + dy * dy)

	let friendlyDx = friendly.x - target.x
	let friendlyDy = friendly.y - target.y
	let friendlyDistance = sqrt(friendlyDx * friendlyDx + friendlyDy * friendlyDy)

	return targetDistance <= range
				&& targetDistance >= minimumDistance
				&& (friendlyDistance >= minimumDistance)
}

typealias Region = Position -> Bool

func circle2(radius: Distance, center: Position) -> Region {
	return { point in
		let shiftedPoint = Position(x: point.x + center.x, y: point.y + center.y)
		return sqrt(shiftedPoint.x * shiftedPoint.x + shiftedPoint.y * shiftedPoint.y) <= radius
	}
}

func shift(offset: Position, region: Region) -> Region {
	return { point in
		let shiftedPoint = Position(x: point.x - offset.x, y: point.y - offset.y)
		return region(shiftedPoint)
	}
}

shift(Position(x: 2, y: 2), circle(10))(Position(x: 5, y: 5))

var checkFn = shift(Position(x: 2, y: 2), circle(10))
checkFn(Position(x: 5, y: 5))

func invert(region: Region) -> Region {
	return { point in
		!region(point)
	}
}

func intersection(region1: Region, region2: Region) -> Region {
	return { point in
		region1(point) && region2(point)
	}
}

func union(region1: Region, region2: Region) -> Region {
	return { point in
		region1(point) || region2(point)
	}
}

func difference(region: Region, minusRegion: Region) -> Region {
	return intersection(region, invert(minusRegion))
}

let minimumDistance: Distance = 2.0

func inRange(ownPosition: Position, target: Position, friendly: Position, range: Distance) -> Bool{
	let rangeRegion = difference(circle(range), circle(minimumDistance))
	let targetRegion = shift(ownPosition, rangeRegion)
	let friendlyRegion = shift(friendly, circle(minimumDistance))
	let resultRegion = difference(targetRegion, friendlyRegion)

	return resultRegion(target)
}

let rangeRegion = difference(circle(range), circle(minimumDistance))

let targetRegion = shift(ownPosition, rangeRegion)

let friendlyRegion = shift(friendly, circle(minimumDistance))

let resultRegion = difference(targetRegion, friendlyRegion)

return resultRegion(target)

inRange(ownPosition: Position(x: 5, y: 5), target: Position(x: 7, y: 7), friendly: Position(x: 1, y: 1), range: 10) // true
inRange(ownPosition: Position(x: 5, y: 5), target: Position(x: 6, y: 6), friendly: Position(x: 1, y: 1), range: 10) // false
inRange(ownPosition: Position(x: 5, y: 5), target: Position(x: 8, y: 8), friendly: Position(x: 7, y: 7), range: 10) // true
