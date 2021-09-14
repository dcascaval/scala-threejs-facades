package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object objects extends js.Object:
	@js.native
	class SkinnedMesh[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val bindMode: String = js.native;
		val bindMatrix: Matrix4 = js.native;
		val bindMatrixInverse: Matrix4 = js.native;
		val skeleton: Skeleton = js.native;
		var isSkinnedMesh: true = js.native;
		def bind(skeleton: Skeleton, bindMatrix: js.UndefOr[Matrix4] = js.undefined): Unit = js.native
		def pose(): Unit = js.native
		def normalizeSkinWeights(): Unit = js.native
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
		def boneTransform(index: Double, target: Vector3): Vector3 = js.native
	val LineStrip: Double = js.native;
	val LinePieces: Double = js.native;
	@js.native
	class LineSegments[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val type: "LineSegments" | String = js.native;
		var isLineSegments: true = js.native;
	@js.native
	class Bone extends js.Object:
		var isBone: true = js.native;
		val type: "Bone" = js.native;
	@js.native
	class Line[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val geometry: TGeometry = js.native;
		val material: TMaterial = js.native;
		val type: "Line" | "LineLoop" | "LineSegments" | String = js.native;
		var isLine: true = js.native;
		val morphTargetInfluences: js.UndefOr[js.UndefOr[js.Array[Double]]] = js.native;
		val morphTargetDictionary: js.UndefOr[js.UndefOr[objectType46]] = js.native;
		def computeLineDistances(): this.type = js.native
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
		def updateMorphTargets(): Unit = js.native
	@js.native
	class Mesh[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val geometry: TGeometry = js.native;
		val material: TMaterial = js.native;
		val morphTargetInfluences: js.UndefOr[js.UndefOr[js.Array[Double]]] = js.native;
		val morphTargetDictionary: js.UndefOr[js.UndefOr[objectType46]] = js.native;
		var isMesh: true = js.native;
		val type: String = js.native;
		def updateMorphTargets(): Unit = js.native
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
	@js.native
	class Points[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val type: "Points" = js.native;
		val morphTargetInfluences: js.UndefOr[js.UndefOr[js.Array[Double]]] = js.native;
		val morphTargetDictionary: js.UndefOr[js.UndefOr[objectType46]] = js.native;
		var isPoints: true = js.native;
		val geometry: TGeometry = js.native;
		val material: TMaterial = js.native;
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
		def updateMorphTargets(): Unit = js.native
	@js.native
	class Sprite extends js.Object:
		val type: "Sprite" = js.native;
		var isSprite: true = js.native;
		val geometry: BufferGeometry = js.native;
		val material: SpriteMaterial = js.native;
		val center: Vector2 = js.native;
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
		def copy(source: this.type): this.type = js.native
	@js.native
	class Group extends js.Object:
		val type: "Group" = js.native;
		var isGroup: true = js.native;
	@js.native
	class LOD extends js.Object:
		val type: "LOD" = js.native;
		val levels: Array[objectType47] = js.native;
		val autoUpdate: Boolean = js.native;
		var isLOD: true = js.native;
		val objects: js.Array[js.Any] = js.native;
		def addLevel(object: Object3D, distance: js.UndefOr[Double] = js.undefined): this.type = js.native
		def getCurrentLevel(): Double = js.native
		def getObjectForDistance(distance: Double): Object3D | null = js.native
		def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
		def update(camera: Camera): Unit = js.native
		def toJSON(meta: js.Any): js.Any = js.native
	@js.native
	class InstancedMesh[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val count: Double = js.native;
		val instanceColor: null | BufferAttribute = js.native;
		val instanceMatrix: BufferAttribute = js.native;
		var isInstancedMesh: true = js.native;
		def getColorAt(index: Double, color: Color): Unit = js.native
		def getMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
		def setColorAt(index: Double, color: Color): Unit = js.native
		def setMatrixAt(index: Double, matrix: Matrix4): Unit = js.native
		def dispose(): Unit = js.native
	@js.native
	class LineLoop[TGeometry <: BufferGeometry},TMaterial <: Material | js.Array[Material]}] extends js.Object:
		val type: "LineLoop" = js.native;
		var isLineLoop: true = js.native;
	@js.native
	class Skeleton extends js.Object:
		val uuid: String = js.native;
		val bones: js.Array[Bone] = js.native;
		val boneInverses: js.Array[Matrix4] = js.native;
		val boneMatrices: Float32Array = js.native;
		val boneTexture: null | DataTexture = js.native;
		val boneTextureSize: Double = js.native;
		val frame: Double = js.native;
		val useVertexTexture: Boolean = js.native;
		def init(): Unit = js.native
		def calculateInverses(): Unit = js.native
		def computeBoneTexture(): this.type = js.native
		def pose(): Unit = js.native
		def update(): Unit = js.native
		def clone(): Skeleton = js.native
		def getBoneByName(name: String): js.UndefOr[Bone] = js.native
		def dispose(): Unit = js.native
