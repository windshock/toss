// entry=0x59120

void H575ec(undefined8 *param_1)

{
  undefined **ppuVar1;
  byte in_w9;
  uint uVar2;
  uint uVar3;
  ulong unaff_x22;
  uint3 uVar4;
  undefined8 uVar5;
  uint3 uVar7;
  undefined8 uVar8;
  byte bVar6;
  byte bVar9;
  
  if (((param_1 < (undefined8 *)0x28621d ^ in_w9 ^ 1) & param_1 < (undefined8 *)0x28621d) == 0) {
    uVar8 = param_1[1];
    uVar5 = *param_1;
    bVar6 = ~-((char)((ulong)uVar5 >> 0x10) == '\0');
    uVar4 = CONCAT12(bVar6,CONCAT11(~-((char)((ulong)uVar5 >> 8) == '\0'),~-((char)uVar5 == '\0')));
    bVar9 = ~-((char)((ulong)uVar8 >> 0x10) == '\0');
    uVar7 = CONCAT12(bVar9,CONCAT11(~-((char)((ulong)uVar8 >> 8) == '\0'),~-((char)uVar8 == '\0')));
    uVar2 = uVar4 & 0xff;
    uVar3 = (uVar4 & 0xff00) >> 8;
    uVar2 = uVar2 & uVar3 | uVar2 ^ uVar3;
    uVar2 = bVar6 & uVar2 | bVar6 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar5 >> 0x18) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar5 >> 0x20) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar5 >> 0x28) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar5 >> 0x30) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar5 >> 0x38) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = uVar7 & 0xff;
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uVar7 & 0xff00) >> 8;
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar2 = bVar9 & uVar2 | bVar9 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar8 >> 0x18) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar8 >> 0x20) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar8 >> 0x28) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar8 >> 0x30) == '\0');
    uVar2 = uVar3 & uVar2 | uVar3 ^ uVar2;
    uVar3 = (uint)(byte)~-((char)((ulong)uVar8 >> 0x38) == '\0');
    if (((uVar3 & uVar2 | uVar3 ^ uVar2) & 1) != 0) {
      DAT_0028621c = 1;
    }
    ppuVar1 = (undefined **)&DAT_00278438;
    if (0xffffffffffffffff -
        ((-DAT_00275ca8 | 0x642804bbf97b14e4U) + (-DAT_00275ca8 & 0x642804bbf97b14e4U) ^
        0xffffffffffffffff) !=
        ((unaff_x22 ^
         0x642804bbf97b14c3 - (-DAT_00275ca8 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff) &
        unaff_x22)) {
      ppuVar1 = &PTR_LAB_002832c8;
    }
                    /* WARNING: Could not recover jumptable at 0x0015aa2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0014b85c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00281c70)();
  return;
}


