// entry=0xa88a4

void Ha88a4(undefined8 *param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  uint3 uVar4;
  undefined8 uVar5;
  uint3 uVar7;
  undefined8 uVar8;
  byte bVar6;
  byte bVar9;
  
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
  ppuVar1 = &PTR_LAB_00286068;
  if (((uVar3 & uVar2 | uVar3 ^ uVar2) & 1) == 0) {
    ppuVar1 = &PTR_LAB_00276378 +
              (long)(int)((-(int)DAT_0027fb18 | 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U)) *
              0x6f;
  }
                    /* WARNING: Could not recover jumptable at 0x001a4264. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


