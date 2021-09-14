package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object helpers extends js.Object:
	@js.native
	class PointLightHelper extends js.Object:
		val type: String = js.native;
		val light: PointLight = js.native;
		val color: js.UndefOr[ColorRepresentation] = js.native;
		val matrix: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		def dispose(): Unit = js.native
		def update(): Unit = js.native
	@js.native
	class BoxHelper extends js.Object:
		val type: String = js.native;
		def update(object: js.UndefOr[Object3D] = js.undefined): Unit = js.native
		def setFromObject(object: Object3D): this.type = js.native
	@js.native
	class SkeletonHelper extends js.Object:
		val type: String = js.native;
		val bones: js.Array[Bone] = js.native;
		val root: Object3D = js.native;
		var isSkeletonHelper: true = js.native;
		val matrix: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		def getBoneList(object: Object3D): js.Array[Bone] = js.native
		def update(): Unit = js.native
	@js.native
	class HemisphereLightHelper extends js.Object:
		val light: HemisphereLight = js.native;
		val matrix: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		val material: MeshBasicMaterial = js.native;
		val color: js.UndefOr[ColorRepresentation] = js.native;
		def dispose(): Unit = js.native
		def update(): Unit = js.native
	@js.native
	class CameraHelper extends js.Object:
		val camera: Camera = js.native;
		val pointMap: objectType17 = js.native;
		val type: String = js.native;
		def update(): Unit = js.native
		def dispose(): Unit = js.native
	@js.native
	class PlaneHelper extends js.Object:
		val type: String = js.native;
		val plane: Plane = js.native;
		val size: Double = js.native;
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	@js.native
	class DirectionalLightHelper extends js.Object:
		val light: DirectionalLight = js.native;
		val lightPlane: Line = js.native;
		val targetLine: Line = js.native;
		val color: js.UndefOr[ColorRepresentation] = js.native;
		val matrix: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		def dispose(): Unit = js.native
		def update(): Unit = js.native
	@js.native
	class Box3Helper extends js.Object:
		val type: String = js.native;
		val box: Box3 = js.native;
	@js.native
	class GridHelper extends js.Object:
		val type: String = js.native;
		def setColors(color1: js.UndefOr[ColorRepresentation] = js.undefined, color2: js.UndefOr[ColorRepresentation] = js.undefined): Unit = js.native
	@js.native
	class PolarGridHelper extends js.Object:
		val type: String = js.native;
	@js.native
	class SpotLightHelper extends js.Object:
		val light: Light = js.native;
		val matrix: Matrix4 = js.native;
		val matrixAutoUpdate: Boolean = js.native;
		val color: js.UndefOr[ColorRepresentation] = js.native;
		val cone: LineSegments = js.native;
		def dispose(): Unit = js.native
		def update(): Unit = js.native
	@js.native
	class ArrowHelper extends js.Object:
		val type: String = js.native;
		val line: Line = js.native;
		val cone: Mesh = js.native;
		def setDirection(dir: Vector3): Unit = js.native
		def setLength(length: Double, headLength: js.UndefOr[Double] = js.undefined, headWidth: js.UndefOr[Double] = js.undefined): Unit = js.native
		def setColor(color: ColorRepresentation): Unit = js.native
	@js.native
	class AxesHelper extends js.Object:
		val type: String = js.native;
		def setColors(xAxisColor: Color, yAxisColor: Color, zAxisColor: Color): this.type = js.native
		def dispose(): Unit = js.native
