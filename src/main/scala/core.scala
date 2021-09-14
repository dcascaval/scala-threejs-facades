package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object core extends js.Object:
	@js.nativetrait Event extends js.Object:
		val type: String = js.native;
		val target: js.UndefOr[js.Any] = js.native;
		@JSBracketAccess
		def apply(attachment: String): js.Any = js.native
	@js.native
	class EventDispatcher extends js.Object:
		def addEventListener(type: String, listener: js.Function1[Event,Unit]): Unit = js.native
		def hasEventListener(type: String, listener: js.Function1[Event,Unit]): Boolean = js.native
		def removeEventListener(type: String, listener: js.Function1[Event,Unit]): Unit = js.native
		def dispatchEvent(event: objectType30): Unit = js.native
	@js.native
	class InterleavedBufferAttribute extends js.Object:
		val name: String = js.native;
		val data: InterleavedBuffer = js.native;
		val itemSize: Double = js.native;
		val offset: Double = js.native;
		val normalized: Boolean = js.native;
		var isInterleavedBufferAttribute: true = js.native;
		def count(): Double = js.native
		def array(): ArrayLike[Double] = js.native
		def needsUpdate(value: Boolean): Unit = js.native
		def applyMatrix4(m: Matrix4): this.type = js.native
		def clone(data: js.UndefOr[js.Object] = js.undefined): BufferAttribute = js.native
		def getX(index: Double): Double = js.native
		def setX(index: Double, x: Double): this.type = js.native
		def getY(index: Double): Double = js.native
		def setY(index: Double, y: Double): this.type = js.native
		def getZ(index: Double): Double = js.native
		def setZ(index: Double, z: Double): this.type = js.native
		def getW(index: Double): Double = js.native
		def setW(index: Double, z: Double): this.type = js.native
		def setXY(index: Double, x: Double, y: Double): this.type = js.native
		def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
		def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
		def toJSON(data: js.UndefOr[js.Object] = js.undefined): objectType31 = js.native
		def applyNormalMatrix(matrix: Matrix): this.type = js.native
		def transformDirection(matrix: Matrix): this.type = js.native
	@js.native
	class InstancedBufferGeometry extends js.Object:
		val type: String = js.native;
		val isInstancedBufferGeometry: Boolean = js.native;
		val groups: Array[objectType32] = js.native;
		val instanceCount: Double = js.native;
		def addGroup(start: Double, count: Double, instances: Double): Unit = js.native
	@js.native
	class Clock extends js.Object:
		val autoStart: Boolean = js.native;
		val startTime: Double = js.native;
		val oldTime: Double = js.native;
		val elapsedTime: Double = js.native;
		val running: Boolean = js.native;
		def start(): Unit = js.native
		def stop(): Unit = js.native
		def getElapsedTime(): Double = js.native
		def getDelta(): Double = js.native
	@js.native
	class Uniform extends js.Object:
		val type: String = js.native;
		val value: js.Any = js.native;
		val dynamic: Boolean = js.native;
		val onUpdateCallback: js.Function0[,Unit] = js.native;
		def onUpdate(callback: js.Function0[,Unit]): Uniform = js.native
	@js.native
	class Object3D extends js.Object:
		val id: Double = js.native;
		val uuid: String = js.native;
		val name: String = js.native;
		val type: String = js.native;
		val parent: Object3D | null = js.native;
		val children: js.Array[Object3D] = js.native;
		val up: Vector3 = js.native;
		var position: Vector3 = js.native;
		var rotation: Euler = js.native;
		var quaternion: Quaternion = js.native;
		var scale: Vector3 = js.native;
		var modelViewMatrix: Matrix4 = js.native;
		var normalMatrix: Matrix3 = js.native;
		val matrix: Matrix4 = js.native;
		val matrixWorld: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		val matrixWorldNeedsUpdate: Boolean = js.native;
		val layers: Layers = js.native;
		val visible: Boolean = js.native;
		val castShadow: Boolean = js.native;
		val receiveShadow: Boolean = js.native;
		val frustumCulled: Boolean = js.native;
		val renderOrder: Double = js.native;
		val animations: js.Array[AnimationClip] = js.native;
		val userData: objectType22 = js.native;
		val customDepthMaterial: Material = js.native;
		val customDistanceMaterial: Material = js.native;
		var isObject3D: true = js.native;
		val onBeforeRender: js.Function6[WebGLRenderer,Scene,Camera,BufferGeometry,Material,Group,Unit] = js.native;
		val onAfterRender: js.Function6[WebGLRenderer,Scene,Camera,BufferGeometry,Material,Group,Unit] = js.native;


		def applyMatrix4(matrix: Matrix4): Unit = js.native
		def applyQuaternion(quaternion: Quaternion): this.type = js.native
		def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
		def setRotationFromEuler(euler: Euler): Unit = js.native
		def setRotationFromMatrix(m: Matrix4): Unit = js.native
		def setRotationFromQuaternion(q: Quaternion): Unit = js.native
		def rotateOnAxis(axis: Vector3, angle: Double): this.type = js.native
		def rotateOnWorldAxis(axis: Vector3, angle: Double): this.type = js.native
		def rotateX(angle: Double): this.type = js.native
		def rotateY(angle: Double): this.type = js.native
		def rotateZ(angle: Double): this.type = js.native
		def translateOnAxis(axis: Vector3, distance: Double): this.type = js.native
		def translateX(distance: Double): this.type = js.native
		def translateY(distance: Double): this.type = js.native
		def translateZ(distance: Double): this.type = js.native
		def localToWorld(vector: Vector3): Vector3 = js.native
		def worldToLocal(vector: Vector3): Vector3 = js.native
		def lookAt(vector: Vector3 | Double, y: js.UndefOr[Double] = js.undefined, z: js.UndefOr[Double] = js.undefined): Unit = js.native
		def add(List(), o, b, j, e, c, t,  , :,  , (, j, s, ., A, r, r, a, y, [, O, b, j, e, c, t, 3, D, ], ), *): this.type = js.native
		def remove(List(), o, b, j, e, c, t,  , :,  , (, j, s, ., A, r, r, a, y, [, O, b, j, e, c, t, 3, D, ], ), *): this.type = js.native
		def removeFromParent(): this.type = js.native
		def clear(): this.type = js.native
		def attach(object: Object3D): this.type = js.native
		def getObjectById(id: Double): js.UndefOr[Object3D] = js.native
		def getObjectByName(name: String): js.UndefOr[Object3D] = js.native
		def getObjectByProperty(name: String, value: String): js.UndefOr[Object3D] = js.native
		def getWorldPosition(target: Vector3): Vector3 = js.native
		def getWorldQuaternion(target: Quaternion): Quaternion = js.native
		def getWorldScale(target: Vector3): Vector3 = js.native
		def getWorldDirection(target: Vector3): Vector3 = js.native
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
		def traverse(callback: js.Function1[Object3D,js.Any]): Unit = js.native
		def traverseVisible(callback: js.Function1[Object3D,js.Any]): Unit = js.native
		def traverseAncestors(callback: js.Function1[Object3D,js.Any]): Unit = js.native
		def updateMatrix(): Unit = js.native
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
		def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit = js.native
		def toJSON(meta: js.UndefOr[objectType33] = js.undefined): js.Any = js.native
		def clone(recursive: js.UndefOr[Boolean] = js.undefined): this.type = js.native
		def copy(source: this.type, recursive: js.UndefOr[Boolean] = js.undefined): this.type = js.native
	
	@js.native
	JSGlobal("BufferGeometryUtils")
	object BufferGeometryUtils extends js.Object:
		def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
		def computeTangents(geometry: BufferGeometry): null = js.native
		def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
	
	@js.native
	JSGlobal("GeometryUtils")
	object GeometryUtils extends js.Object:
		def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.UndefOr[js.Any] = js.undefined): js.Any = js.native
		def center(geometry: js.Any): js.Any = js.native
	@js.native
	class InstancedBufferAttribute extends js.Object:
		val meshPerAttribute: Double = js.native;
	@js.nativetrait Face extends js.Object:
		val a: Double = js.native;
		val b: Double = js.native;
		val c: Double = js.native;
		val normal: Vector3 = js.native;
		val materialIndex: Double = js.native;
	@js.nativetrait Intersection extends js.Object:
		val distance: Double = js.native;
		val distanceToRay: js.UndefOr[js.UndefOr[Double]] = js.native;
		val point: Vector3 = js.native;
		val index: js.UndefOr[js.UndefOr[Double]] = js.native;
		val face: js.UndefOr[js.UndefOr[Facenull]] = js.native;
		val faceIndex: js.UndefOr[js.UndefOr[Double]] = js.native;
		val object: Object3D = js.native;
		val uv: js.UndefOr[js.UndefOr[Vector2]] = js.native;
		val instanceId: js.UndefOr[js.UndefOr[Double]] = js.native;
	@js.nativetrait RaycasterParameters extends js.Object:
		val Mesh: js.UndefOr[js.Any] = js.native;
		val Line: js.UndefOr[js.UndefOr[objectType34]] = js.native;
		val LOD: js.UndefOr[js.Any] = js.native;
		val Points: js.UndefOr[js.UndefOr[objectType34]] = js.native;
		val Sprite: js.UndefOr[js.Any] = js.native;
	@js.native
	class Raycaster extends js.Object:
		val ray: Ray = js.native;
		val near: Double = js.native;
		val far: Double = js.native;
		val camera: Camera = js.native;
		val layers: Layers = js.native;
		val params: RaycasterParameters = js.native;
		def set(origin: Vector3, direction: Vector3): Unit = js.native
		def setFromCamera(coords: objectType35, camera: Camera): Unit = js.native
		def intersectObject(object: Object3D, recursive: js.UndefOr[Boolean] = js.undefined, optionalTarget: js.UndefOr[js.Array[Intersection]] = js.undefined): js.Array[Intersection] = js.native
		def intersectObjects(objects: js.Array[Object3D], recursive: js.UndefOr[Boolean] = js.undefined, optionalTarget: js.UndefOr[js.Array[Intersection]] = js.undefined): js.Array[Intersection] = js.native
	@js.native
	class GLBufferAttribute extends js.Object:
		val buffer: WebGLBuffer = js.native;
		val type: Double = js.native;
		val itemSize: Double = js.native;
		val elementSize: 1 | 2 | 4 = js.native;
		val count: Double = js.native;
		val version: Double = js.native;
		var isGLBufferAttribute: true = js.native;
		def needsUpdate(value: Boolean): Unit = js.native
		def setBuffer(buffer: WebGLBuffer): this.type = js.native
		def setType(type: Double, elementSize: 1 | 2 | 4): this.type = js.native
		def setItemSize(itemSize: Double): this.type = js.native
		def setCount(count: Double): this.type = js.native
	@js.native
	class BufferGeometry extends js.Object:

		val id: Double = js.native;
		val uuid: String = js.native;
		val name: String = js.native;
		val type: String = js.native;
		val index: BufferAttribute | null = js.native;
		val attributes: objectType36 = js.native;
		val morphAttributes: objectType37 = js.native;
		val morphTargetsRelative: Boolean = js.native;
		val groups: Array[objectType38] = js.native;
		val boundingBox: Box3 | null = js.native;
		val boundingSphere: Sphere | null = js.native;
		val drawRange: objectType39 = js.native;
		val userData: objectType22 = js.native;
		var isBufferGeometry: true = js.native;
		val drawcalls: js.Any = js.native;
		val offsets: js.Any = js.native;
		def getIndex(): BufferAttribute | null = js.native
		def setIndex(index: BufferAttribute | js.Array[Double] | null): BufferGeometry = js.native
		def setAttribute(name: BuiltinShaderAttributeName | js.Any, attribute: BufferAttribute | InterleavedBufferAttribute): BufferGeometry = js.native
		def getAttribute(name: BuiltinShaderAttributeName | js.Any): BufferAttribute | InterleavedBufferAttribute = js.native
		def deleteAttribute(name: BuiltinShaderAttributeName | js.Any): BufferGeometry = js.native
		def hasAttribute(name: BuiltinShaderAttributeName | js.Any): Boolean = js.native
		def addGroup(start: Double, count: Double, materialIndex: js.UndefOr[Double] = js.undefined): Unit = js.native
		def clearGroups(): Unit = js.native
		def setDrawRange(start: Double, count: Double): Unit = js.native
		def applyMatrix4(matrix: Matrix4): BufferGeometry = js.native
		def applyQuaternion(q: Quaternion): BufferGeometry = js.native
		def rotateX(angle: Double): BufferGeometry = js.native
		def rotateY(angle: Double): BufferGeometry = js.native
		def rotateZ(angle: Double): BufferGeometry = js.native
		def translate(x: Double, y: Double, z: Double): BufferGeometry = js.native
		def scale(x: Double, y: Double, z: Double): BufferGeometry = js.native
		def lookAt(v: Vector3): Unit = js.native
		def center(): BufferGeometry = js.native
		def setFromPoints(points: js.Array[Vector3] | js.Array[Vector2]): BufferGeometry = js.native
		def computeBoundingBox(): Unit = js.native
		def computeBoundingSphere(): Unit = js.native
		def computeTangents(): Unit = js.native
		def computeVertexNormals(): Unit = js.native
		def merge(geometry: BufferGeometry, offset: js.UndefOr[Double] = js.undefined): BufferGeometry = js.native
		def normalizeNormals(): Unit = js.native
		def toNonIndexed(): BufferGeometry = js.native
		def toJSON(): js.Any = js.native
		def clone(): BufferGeometry = js.native
		def copy(source: BufferGeometry): this.type = js.native
		def dispose(): Unit = js.native
		def addIndex(index: js.Any): Unit = js.native
		def addDrawCall(start: js.Any, count: js.Any, indexOffset: js.UndefOr[js.Any] = js.undefined): Unit = js.native
		def clearDrawCalls(): Unit = js.native
		def addAttribute(name: String, attribute: BufferAttribute | InterleavedBufferAttribute): BufferGeometry = js.native
		def addAttribute(name: js.Any, array: js.Any, itemSize: js.Any): js.Any = js.native
		def removeAttribute(name: String): BufferGeometry = js.native
	@js.native
	class InstancedInterleavedBuffer extends js.Object:
		val meshPerAttribute: Double = js.native;
	@js.native
	class Layers extends js.Object:
		val mask: Double = js.native;
		def set(channel: Double): Unit = js.native
		def enable(channel: Double): Unit = js.native
		def enableAll(): Unit = js.native
		def toggle(channel: Double): Unit = js.native
		def disable(channel: Double): Unit = js.native
		def disableAll(): Unit = js.native
		def test(layers: Layers): Boolean = js.native
	@js.native
	class BufferAttribute extends js.Object:
		val name: String = js.native;
		val array: ArrayLike[Double] = js.native;
		val itemSize: Double = js.native;
		val usage: Usage = js.native;
		val updateRange: objectType40 = js.native;
		val version: Double = js.native;
		val normalized: Boolean = js.native;
		val count: Double = js.native;
		var isBufferAttribute: true = js.native;
		val onUploadCallback: js.Function0[,Unit] = js.native;
		def needsUpdate(value: Boolean): Unit = js.native
		def onUpload(callback: js.Function0[,Unit]): this.type = js.native
		def setUsage(usage: Usage): this.type = js.native
		def clone(): this.type = js.native
		def copy(source: BufferAttribute): this.type = js.native
		def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): this.type = js.native
		def copyArray(array: ArrayLike[Double]): this.type = js.native
		def copyColorsArray(colors: Array[objectType41]): this.type = js.native
		def copyVector2sArray(vectors: Array[objectType35]): this.type = js.native
		def copyVector3sArray(vectors: Array[objectType42]): this.type = js.native
		def copyVector4sArray(vectors: Array[objectType43]): this.type = js.native
		def applyMatrix3(m: Matrix3): this.type = js.native
		def applyMatrix4(m: Matrix4): this.type = js.native
		def applyNormalMatrix(m: Matrix3): this.type = js.native
		def transformDirection(m: Matrix4): this.type = js.native
		def set(value: ArrayLike[Double] | ArrayBufferView, offset: js.UndefOr[Double] = js.undefined): this.type = js.native
		def getX(index: Double): Double = js.native
		def setX(index: Double, x: Double): this.type = js.native
		def getY(index: Double): Double = js.native
		def setY(index: Double, y: Double): this.type = js.native
		def getZ(index: Double): Double = js.native
		def setZ(index: Double, z: Double): this.type = js.native
		def getW(index: Double): Double = js.native
		def setW(index: Double, z: Double): this.type = js.native
		def setXY(index: Double, x: Double, y: Double): this.type = js.native
		def setXYZ(index: Double, x: Double, y: Double, z: Double): this.type = js.native
		def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
		def toJSON(): objectType44 = js.native
	@js.native
	class Int8Attribute extends js.Object:
	@js.native
	class Uint8Attribute extends js.Object:
	@js.native
	class Uint8ClampedAttribute extends js.Object:
	@js.native
	class Int16Attribute extends js.Object:
	@js.native
	class Uint16Attribute extends js.Object:
	@js.native
	class Int32Attribute extends js.Object:
	@js.native
	class Uint32Attribute extends js.Object:
	@js.native
	class Float32Attribute extends js.Object:
	@js.native
	class Float64Attribute extends js.Object:
	@js.native
	class Int8BufferAttribute extends js.Object:
	@js.native
	class Uint8BufferAttribute extends js.Object:
	@js.native
	class Uint8ClampedBufferAttribute extends js.Object:
	@js.native
	class Int16BufferAttribute extends js.Object:
	@js.native
	class Uint16BufferAttribute extends js.Object:
	@js.native
	class Int32BufferAttribute extends js.Object:
	@js.native
	class Uint32BufferAttribute extends js.Object:
	@js.native
	class Float16BufferAttribute extends js.Object:
	@js.native
	class Float32BufferAttribute extends js.Object:
	@js.native
	class Float64BufferAttribute extends js.Object:
	@js.native
	class InterleavedBuffer extends js.Object:
		val array: ArrayLike[Double] = js.native;
		val stride: Double = js.native;
		val usage: Usage = js.native;
		val updateRange: objectType40 = js.native;
		val version: Double = js.native;
		val length: Double = js.native;
		val count: Double = js.native;
		val needsUpdate: Boolean = js.native;
		val uuid: String = js.native;
		def setUsage(usage: Usage): InterleavedBuffer = js.native
		def clone(data: js.Object): InterleavedBuffer = js.native
		def copy(source: InterleavedBuffer): this.type = js.native
		def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
		def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
		def toJSON(data: js.Object): objectType45 = js.native
